node {
  stage ('Build') {
 
    git url: 'https://github.com/iampdu/FingerPrintServer.git'
 
    build() {
 
      bat "mvn clean package"
 
    } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
  }
}