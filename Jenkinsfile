node {
try {
   agent any
        
        tools{
                maven 'Maven'
        }
      

     
	        
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
	      
		      
        
} catch (err) {
 mail bcc: '', body: 'body2', cc: '', from: '', replyTo: '', subject: 'Jenkins  ', to: 'houssem.entr@gmail.com'
        
}
    
         
         
         
        
        
        
        
        
        
}