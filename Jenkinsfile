pipeline {

   agent any
        
        tools{
                maven 'Maven'
        }
      

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
        

 mail bcc: '', body: 'body2', cc: '', from: '', replyTo: '', subject: 'Jenkins  ', to: 'houssem.entr@gmail.com'
        

    
         
         
         
        
        
        
        
        
        
}