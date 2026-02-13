import Intermediário.client


fun main() {
    client.token = "asdf"
    client.connect()
    client.authenticate()
    client.getData()
}
