node {
    
    stages {
        stage('SCM checkout') {
            
            git 'https://github.com/iampdu/FingerPrintServer.git'
        }
    }

    stages {
        stage('Compile-Package') {
            
          sh 'mvn clean package'
        }
    }
}
        
