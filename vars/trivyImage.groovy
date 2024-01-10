def call() {
    sh 'trivy image niketanjenekar/youtube:latest > trivyimage.txt'
}
