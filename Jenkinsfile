pipeline {
    agent any
    
    stages {
           stage('clean'){
		   steps{
		   bat 'mvn clean compile'
		   echo 'compile'
		   }
	   }   
    }
}
