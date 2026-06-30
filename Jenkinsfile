pipeline{
   agent any
    tools{
         maven 'Maven'
         jdk 'JDK21'
    }
    stages{
        stage{
           steps('Checkout'){
               git branch : 'master', url: 'https://github.com/indrajitgupta1620-hub/demo3.git '
           }
        }
        stage{
           steps('Build'){
                bat 'mvn compile'
           }
        }
        stage{
          steps('Test'){
              bat 'mvn test'
          }
          post{
             always{
                 junit allowEmptyResults : true, testResults : 'target/surefire-report/*.xml'
             }
          }
        }
        stage{
           steps('Package'){
               bat 'mvn package -DskipTests'
           }
           post{
              success{
                 archiveArtifacts artifacts : 'target/*.jar'
              }
           }
        }

    }
    post{
               success{echo "Pipeline Succeeded"}
               failure{ech "Pipeline Failure"}
    }
}
