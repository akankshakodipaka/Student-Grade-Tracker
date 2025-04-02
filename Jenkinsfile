pipeline {
    agent any

    tools {
        maven 'maven1'  // Ensure this name matches the one in Jenkins
    }

    stages {
        stage('Clean') {
            steps {
                    bat 'mvn clean install'
                
            }
        }
    }
}
