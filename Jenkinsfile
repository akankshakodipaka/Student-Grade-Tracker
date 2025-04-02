pipeline {
    agent any
	tools{
		maven:'maven'
	}
    
    stages {
           stage('clean'){
		   steps{
		   bat 'mvn clean compile'
		   echo 'compile'
		   }
	   }   
    }
}
