package com.ashokit.java17.textBlocks;

public class TextBlocksDemo {
    public static void main(String[] args) {
        String html = """
                    <html>
                        <head>
                            <title>My HTML Page</title>
                        </head>
                        <body>
                            <h1>Welcome to my HTML page!</h1>
                        </body>
                    </html>
                """;
        System.out.println("html = " + html);

        String json = """
                {
                    "firstName": "Jane",
                    "lastName": "Doe",
                    "age": 25,
                    "address": {
                        "street": "123 Main St",
                        "city": "Springfield"
                    }
                }
                """;
        System.out.println("json = " + json);
        String sql = """
                SELECT id, first_name, last_name
                FROM employees
                WHERE department = 'Engineering'
                ORDER BY last_name;
                """;
        System.out.println("sql = " + sql);


        String myTextBlock = """
                This is a multi-line string
                that can span multiple lines
                and contain any characters
                """;
        System.out.println("myTextBlock = " + myTextBlock);
    }
}
