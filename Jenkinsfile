pipeline {

  environment {
    dockerimagename = "thetips4you/nodeapp"
    dockerImage = ""
  }

  agent any

  stages {

    stage('Apply Kubernetes files') {
      steps{
    withKubeConfig([credentialsId: 'jenkins-robot', serverUrl: 'https://172.16.202.14']) {
      sh 'kubectl get pods -n jenkins'
    }
    }
  }

  }

}
