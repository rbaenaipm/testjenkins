pipeline {
  agent any
      stages{
  node {
  stage('Apply Kubernetes files') {
    withKubeConfig([credentialsId: 'kubernetes-file', serverUrl: 'https://172.16.202.14:6443']) {
      sh 'kubectl apply -f my-kubernetes-directory'
        }
      }
    }
  }
}
