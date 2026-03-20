<!DOCTYPE html>
<html>
<head>
    <title>Catalog Report - ${repoName}</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        table { border-collapse: collapse; width: 100%; }
        th, td { border: 1px solid #ddd; padding: 12px; text-align: left; }
        th { background-color: #4CAF50; color: white; }
        tr:nth-child(even) { background-color: #f2 f2 f2; }
    </style>
</head>
<body>
    <h1>Catalog: ${repoName}</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Titlu</th>
                <th>Autor</th>
                <th>An</th>
                <th>Locație</th>
            </tr>
        </thead>
        <tbody>
            <#list resources as res>
            <tr>
                <td>${res.id}</td>
                <td>${res.title}</td>
                <td>${res.author}</td>
                <td>${res.year}</td>
                <td>${res.location}</td>
            </tr>
            </#list>
        </tbody>
    </table>
</body>
</html>