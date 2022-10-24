pipeline {

  agent any

  stages {

    stage('Apply Kubernetes files') {
      steps{
    withKubeConfig([credentialsId: 'testuser', serverUrl: 'https://172.16.202.14:6443']) {
      sh 'curl -LO "https://storage.googleapis.com/kubernetes-release/release/v1.20.5/bin/linux/amd64/kubectl"'  
      sh 'chmod u+x ./kubectl'
      sh './kubectl -n app1 apply -f kpack/.'
    }
    }
  }

  }

}
