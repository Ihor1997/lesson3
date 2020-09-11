pipeline {
    agent any

    stages{
        stage('Preparation') {
            steps {
                git 'https://github.com/Ihor1997/lesson3.git'
            }
        }
        stage('Unit tests') {
            steps{
                sh 'mvn clean -DsuiteXmlFile=lesson12_homework.xml test'
            }
        }
        stage('UI tests') {
            steps{
                sh 'mvn clean -DsuiteXmlFile=unit-test.xml test'
            }
        }
        stage('Deploy') {
            steps{
                echo 'Deployed'
            }
        }
    }
}