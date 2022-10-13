pipeline {  
  agent {
    node {
      label 'maven'
    }
  }
     
  environment {
    // the address of your harbor registry
    REGISTRY = 'harbor.sc.ipm'
    // the project name
    // make sure your robot account have enough access to the project
    HARBOR_NAMESPACE = 'toybank'
    // docker image name
    APP_NAME = 'docker-example'
    // ‘robot-test’ is the credential ID you created on the KubeSphere console
    HARBOR_CREDENTIAL = credentials('harboradmin')
  }
     
  stages {
    stage('docker login') {
      steps{
        container ('maven') {
          // replace the Docker Hub username behind -u and do not forget ''. You can also use a Docker Hub token. 
          sh '''echo $HARBOR_CREDENTIAL_PSW | docker login $REGISTRY -u 'robot$harboradmin' --password-stdin'''
            }
          }  
        }
           
    stage('build & push') {
      steps {
        container ('maven') {
          sh 'git clone https://github.com/rbaenaipm/testjenkins.git'
          sh 'cd dockerfile-examples/rethinkdb && docker build -t $REGISTRY/$HARBOR_NAMESPACE/$APP_NAME:devops-test .'
          sh 'docker push  $REGISTRY/$HARBOR_NAMESPACE/$APP_NAME:devops-test'
          }
        }
      }
    }
  }
