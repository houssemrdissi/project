
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
				                mail bcc: '', body: "${err}", cc: '', from: '', replyTo: '', subject: 'Jenkins Clean Failure', to: 'houssem.entr@gmail.com'
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
				  
				               
				               def call() {
 def junitPattern = '**/failsafe-reports/*.xml';
 def subject =" write your subject" ;
 String emailTo = "houssem.entr@gmail.com" ;
 def body = " write your mail body"
 def providers = [[$class: 'CulpritsRecipientProvider'], [$class: DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']]
 emailext to: emailTo, recipientProviders: providers, compressLog: true, subject: subject, attachmentsPattern: junitPattern , body: body
}
				               
				               
				                }
				                
				                }

                } 
            }
         
        }

}