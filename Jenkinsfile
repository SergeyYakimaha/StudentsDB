#!groovy

pipeline {
    agent any

    tools {
        maven "3.8.4"
    }

    stages {
        stage("Build Maven") {
          steps {
            bat("mvn clean install")
          }
        }
        stage("Build docker image") {
          steps {
            bat("docker build --build-arg JAR_FILE=target/*.jar -t studentdb .")
          }
        }
    }

//     post {
//         always {
//             cleanWs()
//         }
//     }
}
