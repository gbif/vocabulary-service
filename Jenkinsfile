pipeline {
    triggers {
       pollSCM('') // Enabling being build on Push
    }
    agent any
    tools {
      maven 'Maven3.2'
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}