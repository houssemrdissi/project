pipeline {
        agent any
        
        tools{
                maven 'Maven'
        }
        
        
	        stages{
	            stage('Clean'){
	                steps {
	                mail bcc: '', body: 'body', cc: '', from: '', replyTo: '', subject: 'Jenkins  ', to: 'houssem.entr@gmail.com'
	                
	                 echo "Clean project"
	                 bat "mvn clean"
	
	                }
	            }
	
	             stage('Deploy'){
	                steps {
	                 echo "Deploy project"
	                 bat "mvn deploy"
	                 bat "mvn sonar:sonar"
	
	                } 
	             }
	      
		      }
        
        
         
         
         
         
        
        
        
        
        
        
}