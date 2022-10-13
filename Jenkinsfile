pipeline{
    agent any
    options {
        buildDiscarder(logRotator(numToKeepStr:'5'))
    }
    environment {
        DOCKERHUB_CREDENTIALS = credentials('harboradmin')
    }
    stages{
        stage('LOGIN'){
            steps{
                 sh '''echo $HARBOR_CREDENTIAL_PSW | docker login $REGISTRY -u 'robot$admin' --password-stdin'''
            }
     
        }
    }
}
