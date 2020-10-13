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
                 bat "mvn compile"

                }
            }
            stage('Test'){
                steps{ 
                 echo "Test project"
                 bat "mvn test"
                        
                }
            }
            stage('Package'){
                steps {
                 echo "Package project"
                 bat "mvn package"

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