def printCommandName(commandName) {
    return {
        echo "The command\'s name is : " + commandName
    }
}

def sendEmail(to, subject, body, mimeType="text/html") {
    emailext to:to, from: "jraqi1994@outlook.com", subject: subject, body: body, mimeType: mimeType

}

def test() {
    echo 'Hi, this is pipeline shared library'
}