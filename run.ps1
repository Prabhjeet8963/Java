# Set directories
$src = "src"
$bin = "bin"

# Ask user to choose a folder
Write-Host "Available folders in src/:"
$folders = Get-ChildItem -Path $src -Directory
$folders | ForEach-Object { Write-Host "$($_.Name)" }

$chosen = Read-Host "`nEnter the folder name you want to compile and run"

# Get all .java files in the chosen subdirectory
$sourceFiles = Get-ChildItem "$src\$chosen\*.java" | ForEach-Object { $_.FullName }

# Compile
javac -d $bin $sourceFiles

# Build class name (assuming Main.java has public class Main)
$classPath = $bin
$className = "$chosen.Main"

# Run
if ($?) {
    java -cp $classPath $className
} else {
    Write-Host " Compilation failed."
}
