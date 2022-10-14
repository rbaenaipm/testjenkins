pipeline {

  agent any

  stages {

    stage('Apply Kubernetes files') {
      steps{
    withKubeConfig([credentialsId: 'jenkins-robot', serverUrl: 'https://172.16.202.14:6443', namespace:'jenkins']) {
      sh 'curl -LO "https://storage.googleapis.com/kubernetes-release/release/v1.20.5/bin/linux/amd64/kubectl"'  
      sh 'chmod u+x ./kubectl'  
      sh './kubectl apply -f .'
    }
    }
  }

  }

}
