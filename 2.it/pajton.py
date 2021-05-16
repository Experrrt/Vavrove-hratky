import tkinter
import random

tk= tkinter.Tk()
canvas = tkinter.Canvas(tk, height = 500, width = 500)
tk.title('klikaj')
canvas.pack()

click=0
x = random.randint(0,350)
y = random.randint(0,250)

def clicknutie(event):
    global click
    if((event.x>x and event.x <x+50)and (event.y>y and event.y <y+50)):
        click+=1
    else:
        click-=2
    print(click)

rec = canvas.create_rectangle(x,y,x+50,y+50, fill= 'green')
canvas.bind("<Button-1>", clicknutie)

while(True):
    x = random.randint(0,100)
    y = random.randint(0,100)
    canvas.moveto(rec, x,y)

    tk.update()
    tk.after(800)

tk.mainloop()