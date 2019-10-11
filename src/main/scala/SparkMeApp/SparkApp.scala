package SparkMeApp

import org.apache.spark.sql.DataFrame

object SparkMeApp {
    def EnsureColumnExist(example: DataFrame, column: String): Boolean ={
      if (example.columns.contains(column)){
        true
      }
      else false
    }
}

