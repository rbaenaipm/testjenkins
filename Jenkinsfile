pipeline {
  agent any
  stages {
    stage ('Initialize') {
      steps {
        sh 'cd kpack'
        sh 'curl -LO "https://storage.googleapis.com/kubernetes-release/release/v1.20.5/bin/linux/amd64/kubectl"'  
        sh 'chmod u+x ./kubectl'  
        sh './kubectl get pods'
        sh 'kubectl apply -f kube/.'
      }
    }
  }
}
