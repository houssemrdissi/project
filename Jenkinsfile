
def my="foo"
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
				                }catch(errr)
				                {
				                ${my}= ${errr}
				                }
				                
				                }				             

                } 
            }
         
        }


post {

 failure {
 
 				                mail bcc: '', cc: '', from: '', replyTo: '',
				                subject: "TESTS Job '${env.JOB_NAME}'- (${env.BUILD_NUMBER}) has FAILED with ERROR: ${my} ${errr}",
                                body: readFile("target/surefire-reports/tn.esprit.spring.TimesheetApplicationTests.txt"),
                                mimeType:'text/html',
                                to: 'houssem.entr@gmail.com'
 
 
        }


    always {
				                mail bcc: '', cc: '', from: '', replyTo: '',
				                subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME} - (${env.BUILD_NUMBER})",
                                body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
                                to: 'houssem.entr@gmail.com'
            }
}


}