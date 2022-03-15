let countBox = document.querySelector('#count'),
            count = 0;

        let counting = setInterval(function () {
            if (count == 75) {
                clearInterval(counting);
                return false;
            }
            count += 1;
            countBox.innerHTML = new Intl.NumberFormat().format(count);
        }, 50);

let countBox2 = document.querySelector('#count2'),
        count2 = 0;

        let counting2 = setInterval(function () {
            if (count2 == 850) {
                clearInterval(counting2);
                return false;
        }
            count2 += 10;
            countBox2.innerHTML = new Intl.NumberFormat().format(count2);
        }, 50);

let countBox3 = document.querySelector('#count3'),
        count3 = 0;

        let counting3 = setInterval(function () {
            if (count3 == 12) {
                clearInterval(counting3);
                return false;
        }
            count3 += 1;
            countBox3.innerHTML = new Intl.NumberFormat().format(count3);
        }, 100);