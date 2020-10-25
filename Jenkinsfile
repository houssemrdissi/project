
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
				                mail bcc: '', cc: '', from: '', replyTo: '',
				                subject: "Job '${env.JOB_NAME}'- (${env.BUILD_NUMBER}) has FAILED",
                                body:" 'readFile("target/surefire-reports/tn.esprit.spring.TimesheetApplicationTests.txt")' Please go to ${env.BUILD_URL} for more details. ",
                                mimeType:'text/html',
                                to: 'houssem.entr@gmail.com'
				               
				               
				               

				               
				               
				                }
				                
				                }

                } 
            }
         
        }

}