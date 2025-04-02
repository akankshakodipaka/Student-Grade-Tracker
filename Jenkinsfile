pipeline {
    agent any

    tools {
        maven 'maven1'  // Ensure this name matches the one in Jenkins
    }

    stages {
        stage('Clean') {
            steps {
                    sh 'mvn clean install'
                
            }
        }
    }
}
