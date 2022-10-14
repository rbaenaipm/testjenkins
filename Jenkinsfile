pipeline {

  agent any

  stages {

    stage('Apply Kubernetes files') {
      steps{
    withKubeConfig([credentialsId: 'jenkins-robot', serverUrl: 'https://172.16.202.14', namespace:'jenkins']) {
      sh 'kubectl get pods'
    }
    }
  }

  }

}
