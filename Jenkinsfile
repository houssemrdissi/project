pipeline {
        agent any
        
        tools{
                maven 'Maven'
        }
        stages{
            stage('clean'){
                steps {
                 echo "clean project"
                 bat "mvn clean"

                }
            }
              stage('compile'){
                steps {
                 echo "compile project"
                 bat "mvn compile"

                }
            }
            stage('Test'){
                steps{ 
                 echo "test project"
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