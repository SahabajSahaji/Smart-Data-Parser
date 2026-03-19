# Smart-Data-Parser
Developed a CLI-based Smart Data Parser in Java with regex-powered parsing, file handling, JSON export, and robust error handling

A CLI-based data parsing tool that converts messy input into structured JSON format using Regex and Scanner.

## 🔥 Features
- Multiple delimiters support (, ; |)
- Supports key:value and key=value
- File input support
- JSON export functionality
- Error handling for invalid inputs
- Interactive CLI menu

## ▶ Run
javac *.java
java Main

## 📂 Example Input
name:Sahabaj;age=21|city:Kolkata,score:95

## 📦 Output
{
  "name": "Sahabaj",
  "age": "21",
  "city": "Kolkata",
  "score": "95"
}
