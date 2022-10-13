pipeline {
  agent any
  options{
    buildDiscarder(logrotator(numToKeepStr: '5'))
  }
  environment {
    DOCKERHUB_CREDENTIALS = credentials("harboradmin")
  }
  stages{
    stage('Build'){
      sh 'docker build -t rbaenaipm/rbaenaipm:alpine .'
    }
  }
}
