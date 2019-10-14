import SparkMeApp.SparkSessionTestWrapper
import org.scalatest.FunSpec
import org.scalatest.Assertions

class SparkAppSpec
  extends FunSpec with Assertions
  with SparkSessionTestWrapper {
  import spark.implicits._
  it("Ensure that a certain column is in the dataframe") {
    val sourceDF = Seq(
      ("miguel","3537625",21),
      ("luisa","5386528",23)
    ).toDF("name","id","age")
    assert(SparkMeApp.SparkMeApp.EnsureColumnExist(sourceDF,"age"))
  }
}
