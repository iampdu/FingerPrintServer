node {
  stage ('Staging') { 
    git url: 'https://github.com/iampdu/FingerPrintServer.git' 
   // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
  }
  stage('Compile-package'){
    sh 'mvn clean package'
  }
}