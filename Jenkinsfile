pipeline{
    agent {label "linux"}
    options {
        buildDiscarder(logRotator(numToKeepStr:'5'))
    }
    environment {
        DOCKERHUB_CREDENTIALS = credentials('harboradmin')
    }
    stages{
        stage('Build'){
            steps{
                 sh 'docker builf -t toybank/alpine:rbaenaipm'
            }
     
        }
    }
}
