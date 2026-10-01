import turtle

t = turtle.Turtle()
t.speed(3) 

i = 10
for _ in range(100):
    t.forward(i)
    t.left(90) 
    i += 10

turtle.done()
