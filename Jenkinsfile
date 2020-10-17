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
              stage('Compile'){
                steps {
                 echo "Compile project"
                 bat "mvn install"

                }
            }
            stage('Test'){
                steps{ 
                 echo "Test project"
                        
                }
            }
            stage('Package'){
                steps {
                 echo "Package project"

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