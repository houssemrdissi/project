
pipeline {


        agent any
       
        tools{
                maven 'Maven'
        }
 
        stages{
        
            stage('Clean'){
                steps {
                	        script {
                            try {
				                 echo "Clean project"
				                 bat "mvn clean"
				                }catch(err)
				                {
				                mail bcc: '', body: '${err}', cc: '', from: '', replyTo: '', subject: 'notif', to: 'houssem.entr@gmail.com'
				                }
				                
				                }

                }
            }

             stage('Deploy'){
                steps {
				              script {
                              try {  
				                 echo "Deploy project"
				                 bat "mvn deploy"
				                 bat "mvn sonar:sonar"
				                }catch(err)
				                {
				                mail bcc: '', body: '${err}', cc: '', from: '', replyTo: '', subject: 'notif', to: 'houssem.entr@gmail.com'
				                }
				                
				                }

                } 
            }
         
        }

}