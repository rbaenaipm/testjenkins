pipeline {

  environment {
    dockerimagename = "thetips4you/nodeapp"
    dockerImage = ""
  }
  agent any
  stages {
    stage('Deploying App to Kubernetes') {
      withKubeConfig([credentialsId: 'test2', serverUrl: 'https://172.16.202.14:6443']) {
      sh 'kubectl get pods'
    }
  }

}
