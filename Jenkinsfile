pipeline {

  environment {
    dockerimagename = "thetips4you/nodeapp"
    dockerImage = ""
  }

  agent any

  stages {

    stage('Checkout Source') {
      steps {
        git 'https://github.com/shazforiot/nodeapp_test.git'
      }
    }

    stage('Apply Kubernetes files') {
      steps{
    withKubeConfig([credentialsId: 'test2', serverUrl: 'https://172.16.202.14:6443/']) {
      sh 'kubectl get pods'
    }
    }
  }

  }

}
