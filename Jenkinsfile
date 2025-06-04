pipeline {
    agent any

    tools {
        maven 'Maven 3.9.6' // Replace with your configured Maven version
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/mmr-mani/Selenium_Jenkins.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}
