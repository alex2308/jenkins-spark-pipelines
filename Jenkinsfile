node {
   stage('compile') {
         echo "compiling sbt project"
         sh "${tool name: 'sbt-1.3.0', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/bin/sbt compile"
      }
   stage('test') {
      echo "Testings sbt project"
      sh "${tool name: 'sbt-1.3.0', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/bin/sbt test"
   }
}