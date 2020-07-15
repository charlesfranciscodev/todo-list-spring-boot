-- users
INSERT INTO users (user_id, first_name, last_name, username, avatar_url)
VALUES (1, 'Dominic', 'Margaret', 'lazybear', 'https://charlesfranciscodev.github.io/images/diverseui/male-30.jpg');

INSERT INTO users (user_id, first_name, last_name, username, avatar_url)
VALUES (2, 'Richard', 'Burke', 'whiteostrich', 'https://charlesfranciscodev.github.io/images/diverseui/male-52.jpg');

INSERT INTO users (user_id, first_name, last_name, username, avatar_url)
VALUES (3, 'Alex', 'Ferrer', 'whitedog', 'https://charlesfranciscodev.github.io/images/diverseui/male-11.jpg');

-- todos
INSERT INTO todos (todo_id, title, content, completed, due_date, priority, user_id)
VALUES (
    1,
    'Pudding',
    'Pudding sweet roll bear claw tart caramels halvah lemon drops gingerbread. Cupcake chocolate bar cake danish. Powder sweet halvah tart. Ice cream apple pie dessert.',
    FALSE,
    '2020-04-30',
    2,
    2
);

INSERT INTO todos (todo_id, title, content, completed, due_date, priority, user_id)
VALUES (
    2,
    'Sesame snaps',
    'Sesame snaps gummi bears lemon drops cupcake candy canes halvah lemon drops. Tiramisu dessert pudding jelly tiramisu pastry gummies. Chocolate topping cookie sweet pie sugar plum. Apple pie tart powder. Jelly beans sweet sweet roll tootsie roll jelly jelly-o. Tootsie roll pastry cotton candy tart sesame snaps.',
    FALSE,
    '2020-01-02',
    1,
    1
);

INSERT INTO todos (todo_id, title, content, completed, due_date, priority, user_id)
VALUES (
    3,
    'Cake I',
    'Wafer danish gummies. Sugar plum sweet roll topping donut topping. Cake I love sesame snaps biscuit sugar plum tiramisu chocolate bar sweet roll jelly. Gummi bears topping I love dragée oat cake sesame snaps. Sesame snaps toffee cheesecake I love sugar plum. Ice cream donut caramels chocolate marshmallow liquorice pudding dessert. Soufflé pastry candy marzipan gummi bears',
    TRUE,
    '2020-10-19',
    3,
    3
);
