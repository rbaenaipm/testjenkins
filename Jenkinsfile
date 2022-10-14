pipeline {
  agent any
      stages{
  stage('Apply Kubernetes files') {
    steps{
      sh 'kubectl apply -f kpack/.'
      sh 'bash kpack/bash.sh'
      }
    }
  }
}
