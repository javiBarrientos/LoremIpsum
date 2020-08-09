package edu.elsmancs.loremipsum.domain;

public class ContarCantidad {
    private final String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sem felis, ornare in lectus quis, tincidunt tincidunt sapien. Suspendisse potenti. Donec sagittis eu turpis a semper. Etiam mattis, sapien eu porttitor rutrum, ante neque lobortis nulla, ut dignissim orci elit vitae diam. Praesent accumsan diam in felis ornare, vitae sollicitudin tortor feugiat. Pellentesque vel porttitor tortor. Suspendisse in ipsum id sapien suscipit vulputate.\n" +
            "\n" +
            "Vestibulum dolor mi, viverra pellentesque commodo eget, ultrices ac felis. Quisque cursus placerat porta. Vestibulum lectus metus, vestibulum ut felis id, posuere luctus leo. Cras imperdiet ullamcorper sapien sit amet pellentesque. Ut vitae venenatis nunc. Vestibulum ac suscipit libero, a blandit purus. Sed tempor massa eu orci dignissim fringilla. Mauris ut tincidunt nisl. Aliquam erat volutpat. Donec vehicula et risus ac condimentum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;\n" +
            "\n" +
            "Phasellus tristique dolor ac neque dignissim, vitae imperdiet ante ullamcorper. Suspendisse sollicitudin laoreet purus in vehicula. Proin hendrerit ut mauris et congue. In at hendrerit tortor, sit amet mattis nulla. Fusce orci felis, volutpat eget euismod ut, faucibus aliquam lectus. Integer accumsan tortor et commodo sollicitudin. Nullam a euismod tellus, vel cursus magna. Maecenas at mattis nibh.\n" +
            "\n" +
            "Sed vestibulum ante eu elit blandit ullamcorper. Maecenas molestie lectus et rhoncus molestie. In porta id tortor quis efficitur. Fusce dictum, sem sit amet molestie convallis, neque diam sollicitudin arcu, non facilisis turpis nisl quis lorem. Curabitur turpis erat, dignissim at suscipit nec, laoreet et felis. Duis fringilla magna quis scelerisque elementum. Praesent imperdiet lorem at orci tempus, a condimentum arcu gravida. Ut rutrum mi augue, vel pretium ante euismod quis. Proin egestas, augue lacinia ornare auctor, nunc odio ornare nunc, a tristique eros nibh a nulla. Vestibulum pharetra nunc id tortor vestibulum, at sodales leo consequat. Quisque pretium felis eu elit porta mollis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean aliquam, elit sit amet laoreet sodales, mauris lacus vehicula augue, eleifend iaculis libero erat sit amet dui. Duis porta massa condimentum arcu finibus, sit amet auctor tortor consequat.\n" +
            "\n" +
            "Aliquam pulvinar leo erat, non ultricies nibh molestie sed. Sed ornare, nulla sed auctor posuere, nisi massa condimentum urna, at venenatis nibh mi quis dolor. Donec volutpat nunc eu neque semper vulputate. Quisque ut eleifend nibh, et fringilla sapien. Nunc laoreet consectetur orci eu efficitur. Quisque ut lorem lacinia enim porttitor ultrices. Praesent egestas mauris vel turpis volutpat, in tincidunt purus euismod. Mauris a nulla gravida, auctor eros a, pharetra leo. Aenean suscipit enim pretium ante lacinia commodo.";

    ContarCantidad() {
    }

    String getLoremIpsum() {
        return loremIpsum;
    }

    int ContarFrases() {
        String[] frase = getLoremIpsum().split("[!?.:]+");
        return frase.length;
    }

    int ContarPalabras() {
        String[] palabras = getLoremIpsum().split("\\s+");
        return palabras.length;
    }

    int ContarParrafos() {
        String[] parrafos = getLoremIpsum().split("\\n+");
        return parrafos.length;
    }

    int contarPalindromos(String palabra) {
        String palabraVacia = "";
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra != ' '){
                palabraVacia = palabraVacia + letra;

            } else {
                String girarPalabra = new StringBuilder(palabraVacia).reverse().toString();
                if (palabraVacia.equals(girarPalabra))
                    contador++;
                palabraVacia = "";
            }
        }

        return contador;
    }
}
