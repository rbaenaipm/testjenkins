pipeline {
    agent any 
    environment {
    DOCKERHUB_CREDENTIALS = credentials('harboradmin')
    }
    stages { 
        stage('SCM Checkout') {
            steps{
            git 'https://github.com/rbaenaipm/testjenkins'
            }
        }

        stage('Build docker image') {
            steps {  
                sh 'docker build -t toybank/nodeapp:$BUILD_NUMBER .'
            }
        }
        stage('login to dockerhub') {
            steps{
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login harbor.sc.ipm -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }
        stage('push image') {
            steps{
                sh 'docker push toubank/nodeapp:$BUILD_NUMBER'
            }
        }
}
post {
        always {
            sh 'docker logout'
        }
    }
}
