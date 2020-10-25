
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
				                mail bcc: '', cc: '', from: '', replyTo: '',
				                subject: "Job '${env.JOB_NAME}'- (${env.BUILD_NUMBER}) has FAILED",
                                body: "Please go to ${env.BUILD_URL} for more details. has result ${currentBuild.result} ",
                                to: 'houssem.entr@gmail.com'
				               
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

				               
				               
				               emailext attachLog: true, body:
   """<p>EXECUTED: Job <b>\'${env.JOB_NAME}:${env.BUILD_NUMBER})\'
   </b></p><p>View console output at "<a href="${env.BUILD_URL}"> 
   ${env.JOB_NAME}:${env.BUILD_NUMBER}</a>"</p> 
     <p><i>(Build log is attached.)</i></p>""", 
    compressLog: true,
    recipientProviders: [[$class: 'DevelopersRecipientProvider'], 
     [$class: 'RequesterRecipientProvider']],
    replyTo: 'do-not-reply@company.com', 
    subject: "Status: ${currentBuild.result?:'SUCCESS'} - 
    Job \'${env.JOB_NAME}:${env.BUILD_NUMBER}\'", 
    to: 'houssem.entr@gmail.com'
				               
				               
				                }
				                
				                }

                } 
            }
         
        }

}