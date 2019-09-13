node{
    stage('SCM Checkout')
    {
        git 'https://github.com/iampdu/FingerPrintServer.git'
    }
    stage('Compile Package'){
        sh 'mvn clean package'
    }
}