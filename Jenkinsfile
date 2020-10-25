pipeline {
        agent any
        
        tools{
                maven 'Maven'
        }
        try{
                 mail bcc: '', body: 'body', cc: '', from: '', replyTo: '', subject: 'Jenkins  ', to: 'houssem.entr@gmail.com'
        
	        stages{
	            stage('Clean'){
	                steps {
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
        
        
         } catch(err) {
         
         mail bcc: '', body: '${err}', cc: '', from: '', replyTo: '', subject: 'Jenkins Logs Notification', to: 'houssem.entr@gmail.com'
         
         }
        
        
        
        
        
        
}