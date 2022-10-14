pipeline {
  agent any
      stages{
  stage('Apply Kubernetes files') {
    steps{
      sh 'curl -LO "https://storage.googleapis.com/kubernetes-release/release/v1.20.5/bin/linux/amd64/kubectl"'  
        sh 'chmod u+x ./kubectl'  
        sh './kubectl get pods -n default'
      }
    }
  }
}
