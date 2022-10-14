pipeline {
  agent any
      stages{
  stage('Apply Kubernetes files') {
    steps{
    #withKubeConfig([credentialsId: 'kubernetes-file', serverUrl: 'https://172.16.202.14:6443']) {
      sh 'kubectl apply -f kpack/.'
      sh 'bash kpack/bash.sh'
      }
     }
    }
  }
}
